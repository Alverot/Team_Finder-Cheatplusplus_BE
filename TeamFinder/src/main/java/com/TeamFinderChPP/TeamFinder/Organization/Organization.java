package com.TeamFinderChPP.TeamFinder.Organization;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Organization")
@Data
@NoArgsConstructor
public class Organization {

    @Id
    private ObjectId id;

    private String owner_name;
    private String email;
    private String password;
    private String organization_name;
    private String address_of_organization;
    //private String InvitationURL; //not ready yet


//    public Organization(Organization organization) {
//
//        this.id = new ObjectId();
//        this.owner_name = organization.owner_name;
//        this.email = organization.email;
//        this.password = organization.password;
//        this.organization_name = organization.organization_name;
//        this.address_of_organization = organization.address_of_organization;
//
//    }
    public Organization(String ownername,
                        String email,
                        String password,
                        String OrganizationName,
                        String AddressOfOrganization){

        this.owner_name = ownername;
        this.email = email;
        this.password = password;
        this.organization_name = OrganizationName;
        this.address_of_organization = AddressOfOrganization;

    }


    public String getowner_name() {
        return owner_name;
    }

    public String getorganization_name() {
        return organization_name;
    }

    public String getaddress_of_organization() {
        return address_of_organization;
    }
}
