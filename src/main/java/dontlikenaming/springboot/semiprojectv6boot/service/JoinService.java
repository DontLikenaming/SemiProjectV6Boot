package dontlikenaming.springboot.semiprojectv6boot.service;

import dontlikenaming.springboot.semiprojectv6boot.model.Member;

public interface JoinService {
    String findZipcode(String dong);
    boolean newMember(Member m);
    int checkUserid(String uid);
    boolean loginMember(Member m);
}
