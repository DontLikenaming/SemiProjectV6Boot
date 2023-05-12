package dontlikenaming.springboot.semiprojectv6.DAO;

import dontlikenaming.springboot.semiprojectv6.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
