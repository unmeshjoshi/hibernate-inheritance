package com.inheritance.samples;

import com.inheritance.samples.domain.joinedsubclass.CustomizedProfile;
import com.inheritance.samples.domain.joinedsubclass.ProfileKey;
import com.inheritance.samples.domain.unionsubclass.CustomizedContractEmployee;
import com.inheritance.samples.domain.unionsubclass.EmployeeKey;
import com.inheritance.util.HibernateRepository;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

public class HibernateInheritanceMappingsTest {


    @BeforeClass
    public static void setupDatabase() throws Exception {
        File file =  new File(HibernateInheritanceMappingsTest.class.getClassLoader().getResource("seed/schema.sql").getFile());
        new HibernateRepository().execute(file);
    }

    @Test
    public void shouldPersistUnionSubclassCustomizedCreditFacility() throws Exception {

        CustomizedContractEmployee customizedContractEmployee = new CustomizedContractEmployee();
        customizedContractEmployee.setKey(new EmployeeKey("1", "1"));
        customizedContractEmployee.setName("08");
        customizedContractEmployee.setContractTerm("DAILY");
        customizedContractEmployee.setAdditionalTerms("External");

        HibernateRepository<CustomizedContractEmployee, EmployeeKey> repository = new HibernateRepository<>();
        repository.save(customizedContractEmployee);

        CustomizedContractEmployee savedFacility = repository.load(CustomizedContractEmployee.class, new EmployeeKey("1", "1"));
        Assert.assertNotNull(savedFacility);
    }

    @Test
    public void shouldPersistJoinedSubclassForCustomizedBroker() throws Exception {

        CustomizedProfile broker = new CustomizedProfile();
        broker.setProfileKey(new ProfileKey("1", "1", "1"));
        broker.setProfileSummary("Summary");
        broker.setProfileSummary("AdditionalSummary");

        HibernateRepository<CustomizedProfile, ProfileKey> repository = new HibernateRepository<>();
        repository.save(broker);

        CustomizedProfile savedBroker = repository.load(CustomizedProfile.class, new ProfileKey("1", "1", "1"));
        Assert.assertNotNull(savedBroker);
    }

}