package com.inheritance.samples;

import com.inheritance.samples.domain.joinedsubclass.CustomizedBroker;
import com.inheritance.samples.domain.joinedsubclass.RoleKey;
import com.inheritance.samples.domain.unionsubclass.CustomizedCreditFacility;
import com.inheritance.samples.domain.unionsubclass.FacilityKey;
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

        CustomizedCreditFacility customizedCreditFacility = new CustomizedCreditFacility();
        customizedCreditFacility.setKey(new FacilityKey("1", "1"));
        customizedCreditFacility.setBranchCode("08");
        customizedCreditFacility.setPeriodicityType("DAILY");
        customizedCreditFacility.setExternalSystem("External");

        HibernateRepository<CustomizedCreditFacility, FacilityKey> repository = new HibernateRepository<>();
        repository.save(customizedCreditFacility);

        CustomizedCreditFacility savedFacility = repository.load(CustomizedCreditFacility.class, new FacilityKey("1", "1"));
        Assert.assertNotNull(savedFacility);
    }

    @Test
    public void shouldPersistJoinedSubclassForCustomizedBroker() throws Exception {

        CustomizedBroker broker = new CustomizedBroker();
        broker.setRoleKey(new RoleKey("1", "1", "1"));
        broker.setProfileSummary("Summary");
        broker.setProfileSummary("AdditionalSummary");

        HibernateRepository<CustomizedBroker, RoleKey> repository = new HibernateRepository<>();
        repository.save(broker);

        CustomizedBroker savedBroker = repository.load(CustomizedBroker.class, new RoleKey("1", "1", "1"));
        Assert.assertNotNull(savedBroker);
    }

}