package com.dashboard.core.model.ticket;

import com.dashboard.core.model.project.Project;
import com.dashboard.core.model.project.Sprint;
import com.dashboard.core.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Duration;

/**
 * @author Leboc Philippe.
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    private String label;

    @Size(max = 1000)
    private String description;

    private Duration estimatedTime;

    @ManyToOne
    private Project project;

    @ManyToOne
    private Sprint sprint;

    @NotNull
    private User author;

    private TicketTimeSpent ticketTimeSpent;
}
