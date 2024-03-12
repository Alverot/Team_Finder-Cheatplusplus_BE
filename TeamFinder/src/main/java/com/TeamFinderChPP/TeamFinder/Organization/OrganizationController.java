package com.TeamFinderChPP.TeamFinder.Organization;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/test")
public class OrganizationController {

    private final OrganizationService organizationService;

    @Autowired
    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping("/Organization")
    public ResponseEntity<Organization> registerNewOrganization(@RequestBody Organization organization){
        String ownername = organization.getowner_name();
        String email = organization.getEmail();
        String password = organization.getPassword();
        String organization_name = organization.getorganization_name();
        String AddressOfOrganization = organization.getaddress_of_organization();

        Organization newOrganization = organizationService.addNewOrganization(ownername,email,password,organization_name,AddressOfOrganization);
        return new ResponseEntity<>(newOrganization, HttpStatus.CREATED);
    }

    @GetMapping("/YEY")//metoda de test
    public String ceva(){
        return "Ce zi frumoasa";
    }
}
