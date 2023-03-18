package StaffService;

import java.time.LocalDate;

public class Staff {
    private boolean sex;
    private LocalDate dateOfBirth;
    private String Name;

    public Staff(boolean sex, LocalDate dateOfBirth, String name) {
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        Name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        System.out.printf("Staff Name: %-20s , Sex: %-20s, Date of Birth: %-20s\n"
                , this.getName(), (this.isSex() ? "Nam" : "Nữ"), this.getDateOfBirth());
        return "";
    }
}
