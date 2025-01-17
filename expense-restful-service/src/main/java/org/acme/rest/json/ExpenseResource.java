package org.acme.rest.json;

import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/expenses")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExpenseResource {
    @Inject
    public ExpenseService expenseService;

    @GET
    public Response list() {
        return Response.ok(expenseService.list()).build();
    }

/*
    @POST
    public Response create(ExpenseService.Expense expense) {
        return Response.ok(expenseService.create(expense)).build();
    }

    @DELETE
    @Path("{uuid}")
    public Response delete(@PathParam("uuid") UUID uuid) {
        if (!expenseService.delete(uuid)) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return Response.ok(expenseService.list()).build();
    }
    @PUT
    public void update(ExpenseService.Expense expense) {
        expenseService.update(expense);
    }
    */
}