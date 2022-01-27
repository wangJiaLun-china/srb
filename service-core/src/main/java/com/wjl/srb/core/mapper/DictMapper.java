package com.wjl.srb.core.mapper;

import com.wjl.srb.core.pojo.dto.ExcelDictDTO;
import com.wjl.srb.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 数据字典 Mapper 接口
 * </p>
 *
 * @author wangjialun
 * @since 2022-01-24
 */
public interface DictMapper extends BaseMapper<Dict> {

    void insertBatch(List<ExcelDictDTO> list);
}
