import StaffService.Staff;
import StaffService.StaffService;
import customUtils.ConsoleColors;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    static LinkedList<Staff> staffList = StaffService.getStaffList();
    static ArrayDeque<Staff> NU = StaffService.getNU();
    static ArrayDeque<Staff> NAM = StaffService.getNAM();
    static int size = staffList.size();
    static LinkedList<Staff> staffListOutput = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println(ConsoleColors.GREEN_BOLD + "Danh sách ban đầu: " + ConsoleColors.RESET);
        for (int i = 0; i < size; i++) {
            staffList.get(i).toString();
        }

        //Thuc thi soft list theo ngay sinh
        StaffService staffService = new StaffService();
        Collections.sort(staffList, staffService);

        System.out.println("------------------------------------------------------------------------");
        System.out.println(ConsoleColors.GREEN_BOLD + "Danh sách sắp xếp theo tuổi: " + ConsoleColors.RESET);
        for (int i = 0; i < size; i++) {
            staffList.get(i).toString();
        }

        //Queue phan loai gioi tinh
        StaffService.classifySex();

        //Tai to hop lai vao danh sach moi
        for (int i = 0; i < size; i++) {
            Staff staff;
            if (!NU.isEmpty()) {
                staff = NU.poll();
                staffListOutput.add(staff);
                continue;
            }
            staff = NAM.poll();
            staffListOutput.add(staff);
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println(ConsoleColors.GREEN_BOLD+"Danh sách sắp xếp lại theo giới tính: "+ConsoleColors.RESET);
        for (int i = 0; i < size; i++) {
            staffListOutput.get(i).toString();
        }
    }
}
