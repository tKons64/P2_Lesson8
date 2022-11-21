package Other;

public class Sponsor {

    public enum TypeSponsor {
        COMPANY("Юр. лицо"),
        INDIVIDUAL("Физ. лицо");

        private String comment;

        TypeSponsor(String comment) {
            this.comment = comment;
        }

        public String getComment() {
            return comment;
        }
    }

    private String name;
    private TypeSponsor type;
    private int amount;

    public Sponsor(String name, TypeSponsor type, int amount) {
        this.name = name;
        this.type = type;
        this.amount = amount;
    }

    public void toSponsorRace() {
        System.out.printf("Спонсор s% проспонсировал заезд на сумму - d%", getName(), getAmount());
    }

    public String getName() {
        return name;
    }

    public TypeSponsor getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Спонсор: " + name +
                ", тип - " + type.getComment() +
                ", сумма пожертвования - " + amount + "руб.";
    }
}
