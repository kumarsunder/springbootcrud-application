package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.entity.Organization;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.repository.OrganizationRepository;

@RestController
@RequestMapping("/api/users")
public class OrganizationController {
	@Autowired
	private OrganizationRepository  organizationRepository;

	//get all users
	@GetMapping
	public List<Organization> getALLOrganization(){
		return this.organizationRepository.findAll();  	 
	}

	//get user by id\
	@GetMapping("/{organization_id}")
	public Organization getOrganizationById(@PathVariable (value= "organization_id") int organizationId) {
		return this.organizationRepository.findById(organizationId).orElseThrow(() -> new ResourceNotFoundException("Organization not found with id:" +organizationId));
	}

	// create user
	@PostMapping
	public Organization createOrganization(@RequestBody Organization organization) {
		return this.organizationRepository.save(organization);
	}

	//update user
	@PutMapping("/{organization_id}")
	public Organization updateOrganization(@RequestBody Organization organization, @PathVariable ("organization_id") int organizationId) {
		Organization existingOrganization= this.organizationRepository.findById(organizationId)
				.orElseThrow(() -> new ResourceNotFoundException("Organization not found with id:" +organizationId));
		existingOrganization.setOrganization_id(organization.getOrganization_id());
		existingOrganization.setOrg_code(organization.getOrg_code());
		existingOrganization.setOrganization_name(organization.getOrganization_name());
		existingOrganization.setLogo_path(organization.getLogo_path());
		existingOrganization.setBusiness_entity_type(organization.getBusiness_entity_type());
		existingOrganization.setDate_of_establishment(organization.getDate_of_establishment());
		existingOrganization.setApproved_by(organization.getApproved_by());
		existingOrganization.setRegistered_number(organization.getRegistered_number());
		existingOrganization.setLicense_number_1(organization.getLicense_number_1());
		existingOrganization.setLicense_number_2(organization.getLicense_number_2());
		existingOrganization.setAddress_line_1(organization.getAddress_line_1());
		existingOrganization.setAddress_line_2(organization.getAddress_line_2());
		existingOrganization.setCity_town_village(organization.getCity_town_village());
		existingOrganization.setCountry_name(organization.getCountry_name());
		existingOrganization.setState_name(organization.getState_name());
		existingOrganization.setDistrict_name(organization.getDistrict_name());
		existingOrganization.setPin_code(organization.getPin_code());
		existingOrganization.setIsd_code(organization.getIsd_code());
		existingOrganization.setMobile_no_1(organization.getMobile_no_1());
		existingOrganization.setMobile_no_2(organization.getMobile_no_2());
		existingOrganization.setEmail_id_1(organization.getEmail_id_1());
		existingOrganization.setEmail_id_2(organization.getEmail_id_2());
		existingOrganization.setFax_no(organization.getFax_no());
	    existingOrganization.setPan_no(organization.getPan_no());
		existingOrganization.setTan_no(organization.getTan_no());
		existingOrganization.setGst_number(organization.getGst_number());
				
		existingOrganization.setChairman_name(organization.getChairman_name());
		existingOrganization.setMd_name(organization.getMd_name());
		existingOrganization.setLatitude(organization.getLatitude());
		existingOrganization.setLongitude(organization.getLongitude());
		existingOrganization.setCreated_by(organization.getCreated_by());		
		existingOrganization.setUpdated_by(organization.getUpdated_by());
		return	this.organizationRepository.save(existingOrganization);

	}

	// delete user
	@DeleteMapping("/{organization_id}")
	public ResponseEntity<Organization> deleteOrganization(@PathVariable  ("organization_id") int organizationId){
		Organization existingOrganization= this.organizationRepository.findById(organizationId)
				.orElseThrow(() -> new ResourceNotFoundException("Organization not found with id:" +organizationId));
		this.organizationRepository.delete(existingOrganization);
		return ResponseEntity.ok().build();
	}

}
