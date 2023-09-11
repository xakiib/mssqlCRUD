package com.postgressql.postgressqlCRUD.model;

import com.postgressql.postgressqlCRUD.repository.entity.ENTITY_TblUmUserMaster;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@Builder
public class ResponseObject {
    String status;
    String message;
    Object data;
    String tid;
}
