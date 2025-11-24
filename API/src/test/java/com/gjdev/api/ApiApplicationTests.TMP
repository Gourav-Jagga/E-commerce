package com.gjdev.api;

import com.gjdev.platform.persistance.identitymgmt.etdt.Gender;
import com.gjdev.platform.persistance.identitymgmt.etdt.Identity;
import com.gjdev.platform.persistance.identitymgmt.etdt.IdentityType;
import com.gjdev.platform.persistance.identitymgmt.repo.GenderRepository;
import com.gjdev.platform.persistance.identitymgmt.repo.IdentityRepository;
import com.gjdev.platform.persistance.identitymgmt.repo.IdentityTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

@SpringBootTest
class ApiApplicationTests {

    @Autowired
    private GenderRepository genderRepository;

    @Autowired
    private IdentityTypeRepository identityTypeRepository;

    @Autowired
    private IdentityRepository identityRepository;

    @BeforeEach
    void insertDefaultData() {
        AtomicLong idGenerator = new AtomicLong(1);
        List<Gender> genders;
        if (genderRepository.count() == 0) {
            genders= genderRepository.saveAll(Stream.of("Male", "Female", "Others").map(item -> {
                Gender gender = new Gender();
                gender.setGender(item);
                return gender;
            }).toList());
        }else{
            genders= genderRepository.findAll();
        }
        List<IdentityType> identityTypes;
        if (identityTypeRepository.count() == 0) {
            identityTypes = identityTypeRepository.saveAll(Stream.of("EMP", "CWR", "ADMIN").map(item -> {
                IdentityType identityType = new IdentityType();
                identityType.setIdentityCode(item);
                return identityType;
            }).toList());
        }else{
            identityTypes =  identityTypeRepository.findAll();
        }
        if (identityRepository.count() == 0) {
            List<Identity> identities = Stream.of("ADMIN_USER_EMP_Male", "END_USER_EMP_Female", "CONTRACTOR_USER_EMP_Other").map(item -> {
                Identity identity = new Identity();
                String[] names=item.split("_");
                identity.setFirstname(names[0]);
                identity.setLastName(names[1]);
                identity.setType( identityTypes.stream().filter(i->i.getIdentityCode().equalsIgnoreCase(names[2])).findFirst().orElse(null));
                identity.setGender( genders.stream().filter(i->i.getGender().equalsIgnoreCase(names[3])).findFirst().orElse(null));
                return identity;
            }).toList();
            identities = identityRepository.saveAll(identities);
        }
    }

    @Test
    void testGenderExists() {
        Long size= genderRepository.count();
        assert (size>0);
    }


}
