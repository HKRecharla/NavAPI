package restUtils.model.createUser;

//@Data
public class CreateUser_Response {


    /**
     * {
     *     "name": "morpheus",
     *     "job": "leader",
     *     "id": "220",
     *     "createdAt": "2022-02-03T07:10:54.733Z"
     * }
     */


    private String job;
    private String name;
    private int id;
    private String createdAt;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
