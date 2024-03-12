package com.TeamFinderChPP.TeamFinder.Organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    @Autowired
    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }
//    public void addNewOrganization(Organization organization){//o fosta versiune care nu functiona
//        Organization newOrganization = new Organization(organization);
//        organizationRepository.insert(newOrganization);
//    }
    public Organization addNewOrganization(String OwnerName,String email,String password,String OrganizationName,
                                   String AddressOfOrganization){
        Organization newOrganization = new Organization(OwnerName,email,password,OrganizationName,AddressOfOrganization);
        return organizationRepository.insert(newOrganization);
    }
}
