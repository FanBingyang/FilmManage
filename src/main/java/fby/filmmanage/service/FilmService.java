package fby.filmmanage.service;

import fby.filmmanage.entity.Film;

import java.util.List;

/**
 * @Author: FBY
 * @Date: 2019/10/15 15:57
 * @Version 1.0
 */
public interface FilmService {
    /**
     * 添加影片
     * @param film
     * @return
     */
    int add(Film film);

    /**
     * 更新影片信息
     * @param film
     * @return
     */
    Film update(Film film);

    /**
     * 根据id删除影片
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 根据id查找影片
     * @param id
     * @return
     */
    Film findById(Integer id);

    /**
     * 查看所有影片
     * @return
     */
    List<Film> findall();

    /**
     * 多条件查询影片
     * @param film
     * @return
     */
    List<Film> findExample(Film film);
}
