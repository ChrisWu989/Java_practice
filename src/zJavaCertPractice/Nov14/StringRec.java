package zJavaCertPractice.Nov14;

public class StringRec {
    public static void main(String[] args) {
        String s = "{" + "\"employeeId\":\"Developer\"," +
                    "\"first_name\":\"Dave\""+ "}";

        String json = """
                {
                "employeeId": "Developer",
                "first_name": "Dave"
                }
                """;

        StringBuilder stringBuilder = new StringBuilder(5);
        stringBuilder.setLength(10); // makes length 10 doesnt add 10
        stringBuilder.append("Hello"); //length is 15 since we have 10 and appened 5

        var array = new String[4];
        array[1] = "test1";
        array[2] = "test2";
        array[3] = "test3";
        for (var a : array){
            System.out.println(a);
        }

        var string = "111";
        boolean barray[] = new boolean[1]; // false so prints 111
        if (barray[0]) {
            string = "333";
        }
        System.out.println(string);
    }
}
