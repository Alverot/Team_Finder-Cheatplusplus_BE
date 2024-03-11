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
    public void addNewOrganization(Organization organization){
        Organization newOrganization = new Organization(organization);
        organizationRepository.insert(newOrganization);
    }
}
