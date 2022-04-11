/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Gustavo
 */
public class Causal_analysis {
    private int id;
    private String scenario;
    private String associated_causal_factor;
    private String requirement;
    private String role;
    private String rationale;
    private int guideword_id;
    private int safety_constraint_id;
    private String created_at;
    private String updated_at;

    public Causal_analysis(int id, String scenario, String associated_causal_factor, String requirement, String role, String rationale, int guideword_id, int safety_constraint_id, String created_at, String updated_at) {
        this.id = id;
        this.scenario = scenario;
        this.associated_causal_factor = associated_causal_factor;
        this.requirement = requirement;
        this.role = role;
        this.rationale = rationale;
        this.guideword_id = guideword_id;
        this.safety_constraint_id = safety_constraint_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public String getAssociated_causal_factor() {
        return associated_causal_factor;
    }

    public void setAssociated_causal_factor(String associated_causal_factor) {
        this.associated_causal_factor = associated_causal_factor;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRationale() {
        return rationale;
    }

    public void setRationale(String rationale) {
        this.rationale = rationale;
    }

    public int getGuideword_id() {
        return guideword_id;
    }

    public void setGuideword_id(int guideword_id) {
        this.guideword_id = guideword_id;
    }

    public int getSafety_constraint_id() {
        return safety_constraint_id;
    }

    public void setSafety_constraint_id(int safety_constraint_id) {
        this.safety_constraint_id = safety_constraint_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
    
    
}
