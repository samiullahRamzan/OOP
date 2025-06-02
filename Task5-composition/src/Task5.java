public class Task5 {

}

class Courses{
    private String courseCode;
    private String courseTitle;
}

class Degree{
    private String id;
    private String degreeTitle;
    Courses[] course;
}

// for example if it is computer science department then it's have BSCS,BSSE,BSIT
class Department{
    private String id;
    private String departmentName;
    private Degree[] degree;
}
