//сделано Кирилловым и Унтевским
public class Abonent {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private int totalCallTime;
    private String creditcard_number;
    private double debt;

    //конструктор минимальный
    public Abonent(String name, String surname, String patronymic, String address) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
    }

    //конструктор полный
    public Abonent(int id, String name, String surname, String patronymic, String address, int totalCallTime, String creditcard_number, int debt) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.totalCallTime = totalCallTime;
        this.creditcard_number = creditcard_number;
        this.debt = debt;
    }

    //целая куча гетеров и сетеров


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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotalCallTime() {
        return totalCallTime;
    }

    public void setTotalCallTime(int totalCallTime) {
        this.totalCallTime = totalCallTime;
    }

    public String getCreditcard_number() {
        return creditcard_number;
    }

    public void setCreditcard_number(String creditcard_number) {
        this.creditcard_number = creditcard_number;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    //Оно нормально не пишет :( Но я починил!
    @Override
    public String toString() {
        return  "ИД = " + id +
                ", Ф.И.О='" + name +" " + surname +" "+  patronymic + '\'' +
                ", Адреgс='" + address + '\'' +
                ", Время вызова=" + totalCallTime +
                ", Кредитка=" + creditcard_number +
                ", Задолженность=" + debt +
                '}';
    }
}
