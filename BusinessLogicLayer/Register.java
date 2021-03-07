package BusinessLogicLayer;

public class Register {
    private String Clientname;
    private String ClientSurname;
    private String ClientNumber;
    private String ClientUsername;
    private String ClientPassword;
   
    
    public Register(String Clientname, String ClientSurname, String ClientNumber, String ClientUsername, String ClientPassword) {
     
     this.Clientname = Clientname;
     this.ClientSurname = ClientSurname;
     this.ClientNumber = ClientNumber;
     this.ClientUsername = ClientUsername;
     this.ClientPassword = ClientPassword;
   
        public List<String> GetRegisterList()
        {
            List<String> RegisterDetails = new ArrayList<String>();
            RegisterDetails.add("Anni");
            RegisterDetails.add("Goosen");
            RegisterDetails.add("0125784469");
            RegisterDetails.add("Ann0021");
            RegisterDetails.add("BigF@tcatAn03");
            return RegisterDetails;
        }

        public void Display(){
            System.out.println("-------------------");
            System.out.println("Name\t\tSurname\t\tNumber\t\tUsername\t\tPassword");
            System.out.println("-------------------");
            System.out.println(+Clientname"\t\t"+ClientSurname+"\t\t"+ClientNumber+"\t\t"+ClientUsername+"\t\t"+ClientPassword);
            System.out.println("-------------------");

            
        }
    }
    
}
