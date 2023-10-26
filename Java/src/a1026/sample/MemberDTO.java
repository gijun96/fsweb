package a1026.sample;

public class MemberDTO {
    private int id;
    private String name;
    private int age;
    private String address;

    // 기본 생성자
    public MemberDTO() {
    }

    public MemberDTO(int id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "회원번호=" + id +
                ", 이름='" + name + '\'' +
                ", 나이=" + age +
                ", 주소='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
