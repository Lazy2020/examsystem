package cn.ds.service;

import cn.ds.pojo.*;

import java.util.List;

/**

/**
 * @author ds
 * @date 业务层
 */
public interface UserService extends BaseService<User> {

    User login(String username);
    List<Teacher> findTeacherAll();
    void update(Teacher teacher);
    void create(Teacher teacher);
    List<Point1> findPoint1All();
    void createpoint1(Point1 point1 );
    void createpoint2(Point2 point2);
    List<Point1>Point1All();
    List<Choice> findChoiceAll();
    void createchoice(Choice choice);
    Choice findBychId(Long id);
    Teacher findById(Long id);
    void updatech(Choice choice);
    void deletech(Long id);
    List<ReadProgram> findreadprogramAll();

}
