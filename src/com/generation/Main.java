package com.generation;

public class Main
{
    public static void main( String[] args )
    {
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);

        courseService.enrollStudent( studentId, courseId );
        courseService.enrollStudent( studentId, "art_01" );
        courseService.displayStudentInformation( studentId);

        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        
    //    totalcreditos(studentId);
    }//main
/*    public int totalcreditos(Student student) {
    	Student student = new student();
    	student.totalEnrolledCourses();
    	return 0;
    }*/
    	

}//class Main
