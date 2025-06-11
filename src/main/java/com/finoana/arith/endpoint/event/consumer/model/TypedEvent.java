package com.finoana.arith.endpoint.event.consumer.model;

import com.finoana.arith.PojaGenerated;
import com.finoana.arith.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
