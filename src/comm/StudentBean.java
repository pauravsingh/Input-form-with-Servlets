package comm;
import java.io.Serializable;

public class StudentBean implements Serializable {
	
	//Student Attributes
	
	private int Student_id;
	private String Student_name;
	private String Student_address;
	private String Student_city;
	private String Student_state;
	private int Student_zipcode;
	private String Student_phone;
	private String Student_email;
	private String Student_url;
	private String Student_grad;
	private String Student_date;
	private String Student_recom;
	private String Student_source;
	private String gmu_features;
	private String Student_comments;
	
	/**
	 * Default Constructor
	 */
	public StudentBean() {
	}

	
	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return Student_id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}

	/**
	 * @return the student_name
	 */
	public String getStudent_name() {
		return Student_name;
	}

	/**
	 * @param student_name the student_name to set
	 */
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}

	/**
	 * @return the student_address
	 */
	public String getStudent_address() {
		return Student_address;
	}

	/**
	 * @param student_address the student_address to set
	 */
	public void setStudent_address(String student_address) {
		Student_address = student_address;
	}

	/**
	 * @return the student_city
	 */
	public String getStudent_city() {
		return Student_city;
	}

	/**
	 * @param student_city the student_city to set
	 */
	public void setStudent_city(String student_city) {
		Student_city = student_city;
	}

	/**
	 * @return the student_state
	 */
	public String getStudent_state() {
		return Student_state;
	}

	/**
	 * @param student_state the student_state to set
	 */
	public void setStudent_state(String student_state) {
		Student_state = student_state;
	}

	/**
	 * @return the student_zipcode
	 */
	public int getStudent_zipcode() {
		return Student_zipcode;
	}

	/**
	 * @param student_zipcode the student_zipcode to set
	 */
	public void setStudent_zipcode(int student_zipcode) {
		Student_zipcode = student_zipcode;
	}

	/**
	 * @return the student_phone
	 */
	public String getStudent_phone() {
		return Student_phone;
	}

	/**
	 * @param student_phone the student_phone to set
	 */
	public void setStudent_phone(String student_phone) {
		Student_phone = student_phone;
	}

	/**
	 * @return the student_email
	 */
	public String getStudent_email() {
		return Student_email;
	}

	/**
	 * @param student_email the student_email to set
	 */
	public void setStudent_email(String student_email) {
		Student_email = student_email;
	}

	/**
	 * @return the student_url
	 */
	public String getStudent_url() {
		return Student_url;
	}

	/**
	 * @param student_url the student_url to set
	 */
	public void setStudent_url(String student_url) {
		Student_url = student_url;
	}

	/**
	 * @return the student_grad
	 */
	public String getStudent_grad() {
		return Student_grad;
	}

	/**
	 * @param student_grad the student_grad to set
	 */
	public void setStudent_grad(String student_grad) {
		Student_grad = student_grad;
	}

	/**
	 * @return the student_date
	 */
	public String getStudent_date() {
		return Student_date;
	}

	/**
	 * @param student_date the student_date to set
	 */
	public void setStudent_date(String student_date) {
		Student_date = student_date;
	}

	/**
	 * @return the student_recom
	 */
	public String getStudent_recom() {
		return Student_recom;
	}

	/**
	 * @param student_recom the student_recom to set
	 */
	public void setStudent_recom(String student_recom) {
		Student_recom = student_recom;
	}

	/**
	 * @return the student_source
	 */
	public String getStudent_source() {
		return Student_source;
	}

	/**
	 * @param student_source the student_source to set
	 */
	public void setStudent_source(String student_source) {
		Student_source = student_source;
	}

	/**
	 * @return the gmu_features
	 */
	public String getGmu_features() {
		return gmu_features;
	}

	/**
	 * @param gmu_features the gmu_features to set
	 */
	public void setGmu_features(String gmu_features) {
		this.gmu_features = gmu_features;
	}


	/**
	 * @return the student_comments
	 */
	public String getStudent_comments() {
		return Student_comments;
	}


	/**
	 * @param student_comments the student_comments to set
	 */
	public void setStudent_comments(String student_comments) {
		Student_comments = student_comments;
	}
	
	

}
