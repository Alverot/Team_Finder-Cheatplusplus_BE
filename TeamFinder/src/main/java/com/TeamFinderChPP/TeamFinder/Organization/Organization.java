package com.TeamFinderChPP.TeamFinder.Organization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Organization")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Organization {

    @Id
    private ObjectId id;

    private String OwnerName;
    private String email;
    private String password;
    private String OrganizationName;
    private String AddressOfOrganization;
    //private String InvitationURL; //not ready yet


    public Organization(Organization organization) {

        this.id = new ObjectId();
        this.OwnerName = organization.getOwnerName();
        this.email = organization.getEmail();
        this.password = organization.getPassword();
        this.OrganizationName = organization.getOrganizationName();
        this.AddressOfOrganization = organization.getAddressOfOrganization();

    }
}
