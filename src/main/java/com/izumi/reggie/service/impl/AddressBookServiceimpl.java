package com.izumi.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.izumi.reggie.entity.AddressBook;
import com.izumi.reggie.mapper.AddressBookMapper;
import com.izumi.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceimpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
