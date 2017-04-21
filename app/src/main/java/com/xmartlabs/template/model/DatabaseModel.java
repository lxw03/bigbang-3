package com.xmartlabs.template.model;

import com.raizlabs.android.dbflow.structure.BaseModel;
import com.xmartlabs.base.core.model.EntityWithId;

import lombok.Getter;

public class DatabaseModel<T> extends BaseModel implements EntityWithId<T> {
  @Getter
  T id;
}
