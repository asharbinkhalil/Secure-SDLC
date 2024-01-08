package com.digicl.behavioraldesignpattern.iterator.social_networks;

import com.digicl.behavioraldesignpattern.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
