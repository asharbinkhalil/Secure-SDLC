package com.digicl.behavioraldesignpattern.iterator.iterators;

import com.digicl.behavioraldesignpattern.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
