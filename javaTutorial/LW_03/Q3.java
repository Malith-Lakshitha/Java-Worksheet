public class Q3 {

    private Owner owner;

    public Q3() {
        owner = new Owner();
    }

    public Q3(String name, String num) {
        owner = new Owner(name, num);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getOwnerName() {
        return owner.getOwnerName();
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    class Owner {
        private String ownerName;
        private String phoneNo;

        public Owner() {
            ownerName = "Unknown";
            phoneNo = "Not available";
        }

        public Owner(String ownerName, String phoneNo) {
            this.ownerName = ownerName;
            this.phoneNo = phoneNo;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }
    }

    public static void main(String[] args) {
        Q3 b = new Q3("Malith", "0771234567");
        System.out.println(b.getOwnerName());
        System.out.println(b.getPhoneNo());
    }
}
