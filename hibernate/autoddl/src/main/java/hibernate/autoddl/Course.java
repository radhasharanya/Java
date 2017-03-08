package hibernate.autoddl;
/* create will drop the existing table and create the new one
 * for update if there addition of column or deletion of table and if a table it will not drop it will use the existing if there is no table it will create.
while adding a column if data is exist then new alter should not be not null column

Validate:check mapping schema against table schema
mapping colums ==table colums
mapping columns<=table columns if it is greater than we will get table does not contains column
create-drop : drop-create-drop(you need to call call close method on sessionfactory ie.sf
 */
public class Course {
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	private int cid;
	private String cname;
	private String duration;//new column for table using update auto ddl
	private int fee;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Course() {
		
	}
	
	
}
