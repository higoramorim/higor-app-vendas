function Footer() {
  return (
    <footer className="footer mt-auto py-3 bg-dark">
      <div className="container">
        <p className="text-light">
          App desenvolvido por{' '}
          <a
            href="https://github.com/higoramorim"
            target="_blank"
            rel="noreferrer"
          >
            Higor Amorim
          </a>
        </p>
        <p className="text-light">
          <small>
            <strong>Semana Spring React</strong>
            <br />
            Evento promovido pela escola DevSuperior:{' '}
            <a
              href="www.linkedin.com/in/higor-amorim.ig"
              target="_blank"
              rel="noreferrer"
            >
              Higor Amorim | linkedin
            </a>
          </small>
        </p>
      </div>
    </footer>
  );
}

export default Footer;
