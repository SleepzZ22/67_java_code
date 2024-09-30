package W14;

public class W14_01_Array_Gender {

    public static void main(String[] args) {
        // สร้าง Array ชื่อ name เพื่อเก็บชื่อนักเรียน จำนวน 5 คน
        String[] name = {"นายสมชาย", "นางสมใจ", "นางสาวสมนึก", "นายสมดี", "นางสาวสมฤทัย"};
        String[] codes = {"123TH", "124EN", "125EN", "126TH", "127EN"};

        // 1) แสดงจำนวนนักเรียนทั้งหมด
        System.out.println(name.length);
        System.out.println("====================================");

        // 2) แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย" [startsWith()] และมีจำนวนนักเรียนเท่ากับกี่คน
        // แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย"
        //System.out.println(name[0]); แบบง่ายยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยยย
        //System.out.println(name[3]); |
        // และมีจำนวนนักเรียนเท่ากับกี่คน            
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i].startsWith("นาย")) {
                System.out.println(name[i]);
                count++;
            }
        }
        System.out.println("จำนวนนักเรียนที่ขึ้นต้นด้วย 'นาย' = " + count + " คน");
        System.out.println("====================================");

        //  3) แสดงเฉพาะชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาง" 
        count = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i].startsWith("นาง")) {
                System.out.println(name[i]);
                count++;
            }
        }
        // และมีจำนวนนักเรียนเท่ากับกี่คน 
        System.out.println("จำนวนนักเรียนที่ขึ้นต้นด้วย 'นาง'= " + count + " คน");

        System.out.println("====================================");

        // 4) แสดงชื่อนักเรียนทั้งหมด และแสดงเพศของนักเรียนแต่ละคน
        // ถ้าชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาย" ให้แสดงว่าเป็นเพศชาย
        // ถ้าชื่อนักเรียนขึ้นต้นด้วยคำว่า "นาง" ให้แสดงว่าเป็นเพศหญิง
        // มีจำนวนนักเรียนเท่ากับกี่คน
        count = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i].startsWith("นาง")) {
                System.out.println(name[i] + " เป็นเพศหญิง");
                count++;
            } else {
                System.out.println(name[i] + " เป็นเพศชาย");
                count++;
            }
        }
        System.out.println("จำนวนนักเรียนทั้งหมด " + count + " คน");
        System.out.println("====================================");

        // 5) แสดงเลขลำดับของนักเรียนแต่ละคน 
        // มีจำนวนนักเรียนเท่ากับกี่คน
        // มีจำนวนนักเรียนเพศชายเท่ากับกี่คน
        // มีจำนวนนักเรียนเพศหญิงเท่ากับกี่คน
        int countall = 0;
        int countMale = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i].startsWith("นาง")) {
                System.out.println((i + 1) + "." + name[i] + " : " + " เป็นเพศหญิง");
                countall++;
            } else {
                System.out.println((i + 1) + "." + name[i] + " : " + " เป็นเพศชาย");
                countall++;
                countMale++;
            }
        }
        System.out.println("จำนวนนักเรียนทั้งหมด " + countall + " คน");
        System.out.println("จำนวนนักเรียน ชาย ทั้งหมด " + countMale + " คน");
        System.out.println("จำนวนนักเรียน หญิง ทั้งหมด " + (countall - countMale) + " คน");
        System.out.println("====================================");

    }
}
