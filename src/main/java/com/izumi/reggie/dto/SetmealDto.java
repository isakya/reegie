package com.izumi.reggie.dto;


import com.izumi.reggie.entity.Setmeal;
import com.izumi.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
