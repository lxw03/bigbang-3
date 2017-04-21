package com.xmartlabs.template.model;

import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.xmartlabs.base.core.model.EntityWithId;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@EqualsAndHashCode(callSuper = false)
public class DatabaseModel<T> extends BaseModel implements EntityWithId<T> {
  @PrimaryKey(autoincrement = true)
  T id;
}
