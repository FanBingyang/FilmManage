package fby.filmmanage.util;

import fby.filmmanage.entity.Film;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author 程佩
 * @datatime 2019/10/22 10:11
 * 文件保存
 */
public class FileSaveUtil {
    public FileSaveUtil(Film film, MultipartFile[] files) throws IllegalStateException, IOException {
        String name = null;
        String Dir = "H:\\static\\";
        File file = new File(Dir);
        if (!file.exists()){
            file.mkdir();
        }

        System.out.println(files);
        if (!files[0].isEmpty()){
            name = UUID.randomUUID().toString().replaceAll("-", "") + "." + FilenameUtils.getExtension(files[0].getOriginalFilename());
            film.setCoverImg(name);
            files[0].transferTo(new File(Dir + name));
        }

        if (!files[1].isEmpty()){
            name = UUID.randomUUID().toString().replaceAll("-", "") + "." + FilenameUtils.getExtension(files[1].getOriginalFilename());
            film.setMovie(name);
            files[1].transferTo(new File(Dir + name));
        }
    }
}
