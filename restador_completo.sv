module restador_completo (
    input  logic a,
    input  logic b,
    input  logic bin,
    output logic diff,
    output logic bout
);
  logic d1, b1, b2;

  restador_simple u0(
    .a(a),
    .b(bin),
    .diff(d1),
    .bout(b1)
  );

  restador_simple u1(
    .a(d1),
    .b(b),
    .diff(diff),
    .bout(b2)
  );

  assign bout = b1 | b2;
  // instanciar dos restador_simple y armar bout
endmodule
