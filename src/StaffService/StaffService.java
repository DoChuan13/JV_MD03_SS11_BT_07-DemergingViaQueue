package StaffService;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;

public class StaffService implements Comparator<Staff> {
    private static final LinkedList<Staff> staffList = new LinkedList<>();

    static {
        Staff staff01 = new Staff(true, LocalDate.of(1992, 6, 6), "Do Chuan");
        Staff staff02 = new Staff(false, LocalDate.of(2000, 9, 11), "Minh Thu");
        Staff staff03 = new Staff(false, LocalDate.of(1992, 2, 4), "Hai Yen");
        Staff staff04 = new Staff(false, LocalDate.of(1997, 1, 1), "Thanh Van");
        Staff staff05 = new Staff(true, LocalDate.of(1990, 2, 4), "Manh Son");
        Staff staff06 = new Staff(true, LocalDate.of(1993, 12, 12), "Duc Vuong");
        staffList.add(staff01);
        staffList.add(staff02);
        staffList.add(staff03);
        staffList.add(staff04);
        staffList.add(staff05);
        staffList.add(staff06);
        size = staffList.size();
    }
    static int size;
    private static final ArrayDeque<Staff> NU = new ArrayDeque<>();
    private static final ArrayDeque<Staff> NAM = new ArrayDeque<>();
    public static LinkedList<Staff> getStaffList() {
        return staffList;
    }

    public static ArrayDeque<Staff> getNU() {
        return NU;
    }

    public static ArrayDeque<Staff> getNAM() {
        return NAM;
    }
    @Override
    public int compare(Staff staff01, Staff staff02) {
        //Hàm so sánh trả ra giá trị dùng để sắp xếp
        LocalDate dateOfBirth01 = staff01.getDateOfBirth();
        LocalDate dateOfBirth02 = staff02.getDateOfBirth();
        return dateOfBirth01.compareTo(dateOfBirth02);
    }
    public static void classifySex() {
        for (int i = 0; i < size; i++) {
            Staff staff = staffList.get(i);
            if (staff.isSex()) {
                NAM.add(staff);
                continue;
            }
            NU.add(staff);
        }
    }
}
