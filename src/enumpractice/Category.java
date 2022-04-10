package enumpractice;

public enum Category {
    CATEGORY1("1번카테고리", null),
            SUBONE("1-1", CATEGORY1),
            SUBTWO("1-2", CATEGORY1),
    CATEGORY2("2번타케고리", null),
            FIRST("1-1", CATEGORY2),
            SECOND("1-2", CATEGORY2);

    private String name;
    private Category p;

    public String getName() {
        return name;
    }

    public Category getP() {
        return p;
    }

    Category(String s, Category parent) {
        this.name = s;
        this.p = parent;

    }
}
