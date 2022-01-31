package net.javaguides.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Lb_Organization")
public class Organization {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
	 private int organization_id;	
     
	private String org_code;	
	private String organization_name;	
	private String logo_path;	
	private String business_entity_type;
	private String date_of_establishment;
	private String approved_by;	
	private String registered_number;	
	private String license_number_1;	
	private String license_number_2;	
	private String affilated_to;
	private String address_line_1;
	private String  address_line_2;	   
	private String  city_town_village;
	private String  country_name;
	private String  state_name;
	private String  district_name;
	private String   pin_code;
	private int isd_code;
	private String mobile_no_1;
	private String    mobile_no_2;
	private String  email_id_1;
	private String  email_id_2;
	private String  fax_no;
	private String  pan_no;
	private String  tan_no;
	private String  gst_number;
	private String chairman_name;
	private String md_name;
	private float latitude;
	private float longitude;
	private int created_by;
	private int updated_by;	
	
	public Organization() {
		super();
	}
	public Organization(int organization_id, String org_code, String organization_name, String logo_path,
			String business_entity_type, String date_of_establishment, String approved_by, String registered_number,
			String license_number_1, String license_number_2, String affilated_to, String address_line_1,
			String address_line_2, String city_town_village, String country_name, String state_name,
			String district_name, String pin_code, int isd_code, String mobile_no_1, String mobile_no_2,
			String email_id_1, String email_id_2, String fax_no, String pan_no, String tan_no, String gst_number,
			String chairman_name, String md_name, float latitude, float longitude, int created_by, int updated_by) {
		super();
		this.organization_id = organization_id;
		this.org_code = org_code;
		this.organization_name = organization_name;
		this.logo_path = logo_path;
		this.business_entity_type = business_entity_type;
		this.date_of_establishment = date_of_establishment;
		this.approved_by = approved_by;
		this.registered_number = registered_number;
		this.license_number_1 = license_number_1;
		this.license_number_2 = license_number_2;
		this.affilated_to = affilated_to;
		this.address_line_1 = address_line_1;
		this.address_line_2 = address_line_2;
		this.city_town_village = city_town_village;
		this.country_name = country_name;
		this.state_name = state_name;
		this.district_name = district_name;
		this.pin_code = pin_code;
		this.isd_code = isd_code;
		this.mobile_no_1 = mobile_no_1;
		this.mobile_no_2 = mobile_no_2;
		this.email_id_1 = email_id_1;
		this.email_id_2 = email_id_2;
		this.fax_no = fax_no;
		this.pan_no = pan_no;
		this.tan_no = tan_no;
		this.gst_number = gst_number;
		this.chairman_name = chairman_name;
		this.md_name = md_name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.created_by = created_by;
		this.updated_by = updated_by;
	}
	/**
	 * @return the organization_id
	 */
	public int getOrganization_id() {
		return organization_id;
	}
	/**
	 * @param organization_id the organization_id to set
	 */
	public void setOrganization_id(int organization_id) {
		this.organization_id = organization_id;
	}
	/**
	 * @return the org_code
	 */
	public String getOrg_code() {
		return org_code;
	}
	/**
	 * @param org_code the org_code to set
	 */
	public void setOrg_code(String org_code) {
		this.org_code = org_code;
	}
	/**
	 * @return the organization_name
	 */
	public String getOrganization_name() {
		return organization_name;
	}
	/**
	 * @param organization_name the organization_name to set
	 */
	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}
	/**
	 * @return the logo_path
	 */
	public String getLogo_path() {
		return logo_path;
	}
	/**
	 * @param logo_path the logo_path to set
	 */
	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}
	/**
	 * @return the business_entity_type
	 */
	public String getBusiness_entity_type() {
		return business_entity_type;
	}
	/**
	 * @param business_entity_type the business_entity_type to set
	 */
	public void setBusiness_entity_type(String business_entity_type) {
		this.business_entity_type = business_entity_type;
	}
	/**
	 * @return the date_of_establishment
	 */
	public String getDate_of_establishment() {
		return date_of_establishment;
	}
	/**
	 * @param date_of_establishment the date_of_establishment to set
	 */
	public void setDate_of_establishment(String date_of_establishment) {
		this.date_of_establishment = date_of_establishment;
	}
	/**
	 * @return the approved_by
	 */
	public String getApproved_by() {
		return approved_by;
	}
	/**
	 * @param approved_by the approved_by to set
	 */
	public void setApproved_by(String approved_by) {
		this.approved_by = approved_by;
	}
	/**
	 * @return the registered_number
	 */
	public String getRegistered_number() {
		return registered_number;
	}
	/**
	 * @param registered_number the registered_number to set
	 */
	public void setRegistered_number(String registered_number) {
		this.registered_number = registered_number;
	}
	/**
	 * @return the license_number_1
	 */
	public String getLicense_number_1() {
		return license_number_1;
	}
	/**
	 * @param license_number_1 the license_number_1 to set
	 */
	public void setLicense_number_1(String license_number_1) {
		this.license_number_1 = license_number_1;
	}
	/**
	 * @return the license_number_2
	 */
	public String getLicense_number_2() {
		return license_number_2;
	}
	/**
	 * @param license_number_2 the license_number_2 to set
	 */
	public void setLicense_number_2(String license_number_2) {
		this.license_number_2 = license_number_2;
	}
	/**
	 * @return the affilated_to
	 */
	public String getAffilated_to() {
		return affilated_to;
	}
	/**
	 * @param affilated_to the affilated_to to set
	 */
	public void setAffilated_to(String affilated_to) {
		this.affilated_to = affilated_to;
	}
	/**
	 * @return the address_line_1
	 */
	public String getAddress_line_1() {
		return address_line_1;
	}
	/**
	 * @param address_line_1 the address_line_1 to set
	 */
	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}
	/**
	 * @return the address_line_2
	 */
	public String getAddress_line_2() {
		return address_line_2;
	}
	/**
	 * @param address_line_2 the address_line_2 to set
	 */
	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}
	/**
	 * @return the city_town_village
	 */
	public String getCity_town_village() {
		return city_town_village;
	}
	/**
	 * @param city_town_village the city_town_village to set
	 */
	public void setCity_town_village(String city_town_village) {
		this.city_town_village = city_town_village;
	}
	/**
	 * @return the country_name
	 */
	public String getCountry_name() {
		return country_name;
	}
	/**
	 * @param country_name the country_name to set
	 */
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	/**
	 * @return the state_name
	 */
	public String getState_name() {
		return state_name;
	}
	/**
	 * @param state_name the state_name to set
	 */
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	/**
	 * @return the district_name
	 */
	public String getDistrict_name() {
		return district_name;
	}
	/**
	 * @param district_name the district_name to set
	 */
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	/**
	 * @return the pin_code
	 */
	public String getPin_code() {
		return pin_code;
	}
	/**
	 * @param pin_code the pin_code to set
	 */
	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}
	/**
	 * @return the isd_code
	 */
	public int getIsd_code() {
		return isd_code;
	}
	/**
	 * @param isd_code the isd_code to set
	 */
	public void setIsd_code(int isd_code) {
		this.isd_code = isd_code;
	}
	/**
	 * @return the mobile_no_1
	 */
	public String getMobile_no_1() {
		return mobile_no_1;
	}
	/**
	 * @param mobile_no_1 the mobile_no_1 to set
	 */
	public void setMobile_no_1(String mobile_no_1) {
		this.mobile_no_1 = mobile_no_1;
	}
	/**
	 * @return the mobile_no_2
	 */
	public String getMobile_no_2() {
		return mobile_no_2;
	}
	/**
	 * @param mobile_no_2 the mobile_no_2 to set
	 */
	public void setMobile_no_2(String mobile_no_2) {
		this.mobile_no_2 = mobile_no_2;
	}
	/**
	 * @return the email_id_1
	 */
	public String getEmail_id_1() {
		return email_id_1;
	}
	/**
	 * @param email_id_1 the email_id_1 to set
	 */
	public void setEmail_id_1(String email_id_1) {
		this.email_id_1 = email_id_1;
	}
	/**
	 * @return the email_id_2
	 */
	public String getEmail_id_2() {
		return email_id_2;
	}
	/**
	 * @param email_id_2 the email_id_2 to set
	 */
	public void setEmail_id_2(String email_id_2) {
		this.email_id_2 = email_id_2;
	}
	/**
	 * @return the fax_no
	 */
	public String getFax_no() {
		return fax_no;
	}
	/**
	 * @param fax_no the fax_no to set
	 */
	public void setFax_no(String fax_no) {
		this.fax_no = fax_no;
	}
	/**
	 * @return the pan_no
	 */
	public String getPan_no() {
		return pan_no;
	}
	/**
	 * @param pan_no the pan_no to set
	 */
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	/**
	 * @return the tan_no
	 */
	public String getTan_no() {
		return tan_no;
	}
	/**
	 * @param tan_no the tan_no to set
	 */
	public void setTan_no(String tan_no) {
		this.tan_no = tan_no;
	}
	/**
	 * @return the gst_number
	 */
	public String getGst_number() {
		return gst_number;
	}
	/**
	 * @param gst_number the gst_number to set
	 */
	public void setGst_number(String gst_number) {
		this.gst_number = gst_number;
	}
	/**
	 * @return the chairman_name
	 */
	public String getChairman_name() {
		return chairman_name;
	}
	/**
	 * @param chairman_name the chairman_name to set
	 */
	public void setChairman_name(String chairman_name) {
		this.chairman_name = chairman_name;
	}
	/**
	 * @return the md_name
	 */
	public String getMd_name() {
		return md_name;
	}
	/**
	 * @param md_name the md_name to set
	 */
	public void setMd_name(String md_name) {
		this.md_name = md_name;
	}
	/**
	 * @return the latitude
	 */
	public float getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public float getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the created_by
	 */
	public int getCreated_by() {
		return created_by;
	}
	/**
	 * @param created_by the created_by to set
	 */
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	/**
	 * @return the updated_by
	 */
	public int getUpdated_by() {
		return updated_by;
	}
	/**
	 * @param updated_by the updated_by to set
	 */
	public void setUpdated_by(int updated_by) {
		this.updated_by = updated_by;
	}
	
	
}
