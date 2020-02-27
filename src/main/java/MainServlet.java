import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

    @Inject
    @StudentAnnotation
    Person student;

    @Inject
    @WorkerAnnotation
    Person worker;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println(student.getName());
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Student name:" + student.getName());
        printWriter.write("Worker name:" + worker.getName());
    }
}
