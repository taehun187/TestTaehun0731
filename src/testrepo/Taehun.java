package testrepo;

public class Taehun {
    String gender;
    int age;

    public Taehun() {
    }

    public Taehun(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

	@Override
	public String toString() {
		return "Taehun [gender=" + gender + ", age=" + age + "]";
	}
    
    
}
