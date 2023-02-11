package com.izumi.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.izumi.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
