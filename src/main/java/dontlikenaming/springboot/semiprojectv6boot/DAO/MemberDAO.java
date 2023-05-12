package dontlikenaming.springboot.semiprojectv6boot.DAO;

import dontlikenaming.springboot.semiprojectv6boot.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
