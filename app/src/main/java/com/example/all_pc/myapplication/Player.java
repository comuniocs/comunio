package com.example.all_pc.myapplication;

import java.io.Serializable;

/**
 * Created by Enrique on 19/11/2015.
 */
public class Player implements Serializable {

    private int id;
    private String nick;
    private String alias;
    private int role;
    private int category_id;
    private String short_name;
    private String nameShow;
    private String basealias;
    private int teamId;
    private String team_shield;
    private String player_img;
    private String team_name;

    public int getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    public String getAlias() {
        return alias;
    }

    public int getRole() {
        return role;
    }

    public int getCategory_id() {
        return category_id;
    }

    public String getShort_name() {
        return short_name;
    }

    public String getNameShow() {
        return nameShow;
    }

    public String getBasealias() {
        return basealias;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeam_shield() {
        return team_shield;
    }

    public String getPlayer_img() {
        return player_img;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public void setNameShow(String nameShow) {
        this.nameShow = nameShow;
    }

    public void setBasealias(String basealias) {
        this.basealias = basealias;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public void setTeam_shield(String team_shield) {
        this.team_shield = team_shield;
    }

    public void setPlayer_img(String player_img) {
        this.player_img = player_img;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
}
