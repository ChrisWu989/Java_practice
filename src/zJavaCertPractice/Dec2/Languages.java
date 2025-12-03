package zJavaCertPractice.Dec2;

Locale.setDefault(new Locale("fr", "CA")); //Set default to French Canada
Locale l = Locale.getDefault();
ResourceBundle rb = ResourceBundle.getBundle("appmessages", l);
String msg = rb.getString("greetings");
System.out.println(msg);

appmessages_fr_CA.properties