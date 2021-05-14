package com.mmelo.designpatterns.creation.prototype;

public interface PrototypeCapable extends Cloneable {
    PrototypeCapable clone() throws CloneNotSupportedException;
}