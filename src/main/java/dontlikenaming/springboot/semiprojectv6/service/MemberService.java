package dontlikenaming.springboot.semiprojectv6.service;

import dontlikenaming.springboot.semiprojectv6.model.Member;

import javax.servlet.http.HttpSession;

public interface MemberService {
    boolean checkLogin(Member m, HttpSession sess);
}
