package mygroup;

public class DataKey {
    private int id;
    private String name;

    DataKey(){}

    DataKey(int id, String name){
        this.id=id;
        this.name=name;
    }

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

    @Override
    public String toString(){
        return id+"-"+name;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = result*prime + id;
        result = result*prime + ( ( name == null ? 0 : name.hashCode() ) );
        return  1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataKey)) return false;
        DataKey dataKey = (DataKey) o;
        return id == dataKey.id &&
                name.equals(dataKey.name);
    }
}
