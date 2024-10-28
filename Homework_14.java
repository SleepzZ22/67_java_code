public class Homework_14{
    public static void main(String[] args){
        String[] codes = {"123TH","124EN","125EN","126TH","127EN"};
        int count = 0; 

        //แสดงจำนวนพัสดุทั้งหมดเท่าไหร่
        System.out.println("จำนวนพัสดุทั้งหมดคือ = " + codes.length);
        System.out.println("======================================================");

        //มีจำนวนพัสดุที่มาจากไทยเท่าไหร่
        for(String code : codes){
            if(code.endsWith("TH")) {
                count++;
            }
        }
        
        //จำนวนพัสดุจากไทย
        System.out.println("มีจำนวนพัสดุที่มาจากไทย: " + count);
        System.out.println("======================================================");
        //มีจำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่
        count = 0;
        for(String code : codes){
            if(code.endsWith("EN")) {
                count++;                 
            }
        }
      
        System.out.println("มีจำนวนพัสดุที่มาจาdต่างประเทศ: " + count);
        System.out.println("======================================================");
        //แสดงรายการพัสดุ พร้อมทั้งทั้งบอกว่ามาจากไทยหรือต่างประเทศ
        int countAll = 0;
        int countThai = 0;
        int countEn = 0;
        for(int i = 0; i <codes.length ; i++) {
            if (codes[i].endsWith("TH")){
                System.out.println((i+1) + ", " + codes[i] + " มาจากประเทศไทย");
                countThai++;
            }else{
                System.out.println((i+1) + ", " + codes[i] + " มาจากต่างประเทศ");
                countEn++;            
            }
            countAll++;
        }
        System.out.println("=======================================================");
        //แสดงจำนวนพัสดุทั้งหมด
        System.out.println("จำนวนพัสดุทั้งหมด = " + countAll + " ชิ้น");
        //แสดงจำนวนพ้สดุที่มาจากไทย
        System.out.println("จำนวนพัสดุทั้งหมด = " + countThai + " ชิ้น");
        //แสดงจำนวนพัสดุที่มาจากต่างประเทศ
        System.out.println("จำนวนพัสดุที่มาจากต่างประเทศ = " + countEn + " ชิ้น");
        System.out.println("=======================================================");
    } 

}